package com.uylab.apitest.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.uylab.apitest.R;
import com.uylab.apitest.util.remote.model.PaymentNotification.Installment;
import com.uylab.apitest.util.remote.model.batch_enrollment.BatchEnrollModel;
import com.uylab.apitest.util.remote.model.batches.BatchModel;
import com.uylab.apitest.util.remote.model.branches.BranchModel;
import com.uylab.apitest.util.remote.model.classRoutine.ClassRoutine;
import com.uylab.apitest.util.remote.model.contact_us.ContactModel;
import com.uylab.apitest.util.remote.model.courseList.CourseModel;
import com.uylab.apitest.util.remote.model.course_enrollment.CourseEnrollModel;
import com.uylab.apitest.util.remote.model.event.EventModel;
import com.uylab.apitest.util.remote.model.facullty.FaculitylModel;
import com.uylab.apitest.util.remote.model.gallery.GalleryModel;
import com.uylab.apitest.util.remote.model.join.Example;
import com.uylab.apitest.util.remote.model.login.LoginModel;
import com.uylab.apitest.util.remote.model.mentors.MentorModel;
import com.uylab.apitest.util.remote.model.notice.NoticeModel;
import com.uylab.apitest.util.remote.model.offer_enrollment.OffersEnrollModel;
import com.uylab.apitest.util.remote.model.offers.OffersModel;
import com.uylab.apitest.util.remote.model.partners.PartenersModel;
import com.uylab.apitest.util.remote.model.profile.ProfileModel;
import com.uylab.apitest.util.remote.model.seminar.SeminarModel;
import com.uylab.apitest.util.remote.model.seminarEnrolment.SeminarEnrolModel;
import com.uylab.apitest.util.remote.model.tutorials.TutorialModel;
import com.uylab.apitest.util.remote.retrofit.RemoteApiInterface;
import com.uylab.apitest.util.remote.retrofit.RemoteApiProvider;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RemoteApiInterface networkCall;
    private TextView textView;
    private final String TAG = getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.display);
        //initialization
        networkCall = RemoteApiProvider.getInstance().getRemoteApi();

        loginCall();
        profileCall();
        installmentCall();
        joinCall();
        notificationsCall();
        noticeCall();
        classRoutineCall();
        facullityCall();
        galleryCall();
        seminarCall();
        tutorialsCall();
        contactCall();
        branchesCall();
        mentorsCall();
        batchEnrollCall();
        batchesCall();
        offerEnrolmentCall();
        offersCall();
        partnersCall();
        courseEnrollCall();
       // courseCall();
        eventCall();
        SeminarEnrolmentCall();
    }

    private void loginCall() {
        networkCall.login("rezoyanulislam890@gmail.com", "password").enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {
                if (response.isSuccessful()) {
                    LoginModel model = response.body();
                    Log.d(TAG, "response1:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {
                Log.d(TAG, "failed:" + " " + t.getMessage());
            }
        });
    }

    private void joinCall() {
        networkCall.joinrequest("John Doe", "01814000000", "Graphics Design").enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful()) {
                    Example model = response.body();
                    Log.d(TAG, "response2:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d(TAG, "failed:" + " " + t.getMessage());
            }
        });
    }

    private void profileCall() {
        networkCall.profile().enqueue(new Callback<ProfileModel>() {
            @Override
            public void onResponse(Call<ProfileModel> call, Response<ProfileModel> response) {
                if (response.isSuccessful()) {
                    ProfileModel model = response.body();
                    Log.d(TAG, "response3:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<ProfileModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }


    private void notificationsCall() {
        networkCall.notifications().enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                if (response.isSuccessful()) {
                    Example model = response.body();
                    Log.d(TAG, "response4:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }



    private void installmentCall(){

        networkCall.paymentInformation().enqueue(new Callback<Installment>() {
            @Override
            public void onResponse(Call<Installment> call, Response<Installment> response) {

                if (response.isSuccessful()) {
                    Installment model = response.body();
                    Log.d(TAG, "response5:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }

            }

            @Override
            public void onFailure(Call<Installment> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());

            }
        });
    }



    private void classRoutineCall()
    {
        networkCall.classRoutine().enqueue(new Callback<ClassRoutine>() {
            @Override
            public void onResponse(Call<ClassRoutine> call, Response<ClassRoutine> response) {

                if (response.isSuccessful()) {
                    ClassRoutine model = response.body();
                    Log.d(TAG, "response6:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<ClassRoutine> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());

            }
        });
    }


    private void noticeCall()
    {
        networkCall.notice().enqueue(new Callback<NoticeModel>() {
            @Override
            public void onResponse(Call<NoticeModel> call, Response<NoticeModel> response) {

                if (response.isSuccessful()) {
                    NoticeModel model = response.body();
                    Log.d(TAG, "response7:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }

            }

            @Override
            public void onFailure(Call<NoticeModel> call, Throwable t) {

                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }


    private void galleryCall(){

        networkCall.gallery().enqueue(new Callback<GalleryModel>() {
            @Override
            public void onResponse(Call<GalleryModel> call, Response<GalleryModel> response) {

                if (response.isSuccessful()) {
                    GalleryModel model = response.body();
                    Log.d(TAG, "response8:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }

            }

            @Override
            public void onFailure(Call<GalleryModel> call, Throwable t) {

                Log.d(TAG, "failed!:" + t.getMessage());

            }
        });
    }


    private void tutorialsCall()
    {
        networkCall.tutorials().enqueue(new Callback<TutorialModel>() {
            @Override
            public void onResponse(Call<TutorialModel> call, Response<TutorialModel> response) {
                if (response.isSuccessful()) {
                    TutorialModel model = response.body();
                    Log.d(TAG, "response9:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<TutorialModel> call, Throwable t) {

                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }


    private void facullityCall()
    {
        networkCall.facilities().enqueue(new Callback<FaculitylModel>() {
            @Override
            public void onResponse(Call<FaculitylModel> call, Response<FaculitylModel> response) {
                if (response.isSuccessful()) {
                    FaculitylModel model = response.body();
                    Log.d(TAG, "response10:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<FaculitylModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }

    private void seminarCall()
    {
        networkCall.seminars().enqueue(new Callback<SeminarModel>() {
            @Override
            public void onResponse(Call<SeminarModel> call, Response<SeminarModel> response) {
                if (response.isSuccessful()) {
                    SeminarModel model = response.body();
                    Log.d(TAG, "response11:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<SeminarModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }

    private void SeminarEnrolmentCall()
    {
        networkCall.seminar("John Doe", "5 ", "01814010101", "contact@johndoe.com").enqueue(new Callback<SeminarEnrolModel>() {
            @Override
            public void onResponse(Call<SeminarEnrolModel> call, Response<SeminarEnrolModel> response) {
                if (response.isSuccessful()) {
                    SeminarEnrolModel model = response.body();
                    Log.d(TAG, "response12:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<SeminarEnrolModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }


    private void eventCall()
    {
        networkCall.events().enqueue(new Callback<EventModel>() {
            @Override
            public void onResponse(Call<EventModel> call, Response<EventModel> response) {
                if (response.isSuccessful()) {
                    EventModel model = response.body();
                    Log.d(TAG, "response13:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<EventModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }

 public void coursesCall()
 {
     networkCall.courses().enqueue(new Callback<CourseModel>() {
         @Override
         public void onResponse(Call<CourseModel> call, Response<CourseModel> response) {
             if (response.isSuccessful()) {
                 CourseModel model = response.body();
                 Log.d(TAG, "response14:" + model.toString());
                 textView.setText("" + model.toString());
             } else {
                 Log.d(TAG, "error:" + response.code());
             }
         }

         @Override
         public void onFailure(Call<CourseModel> call, Throwable t) {
             Log.d(TAG, "failed!:" + t.getMessage());
         }
     });
 }

    public void courseEnrollCall()
    {
        networkCall.course("John Doe", "7 ", "01814010101", "contact@johndoe.com").enqueue(new Callback<CourseEnrollModel>() {
            @Override
            public void onResponse(Call<CourseEnrollModel> call, Response<CourseEnrollModel> response) {
                if (response.isSuccessful()) {
                    CourseEnrollModel model = response.body();
                    Log.d(TAG, "response15:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<CourseEnrollModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }


    public void partnersCall()
    {
        networkCall.partners().enqueue(new Callback<PartenersModel>() {
            @Override
            public void onResponse(Call<PartenersModel> call, Response<PartenersModel> response) {
                if (response.isSuccessful()) {
                    PartenersModel model = response.body();
                    Log.d(TAG, "response16:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<PartenersModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }



    public void offersCall()
    {
        networkCall.offers().enqueue(new Callback<OffersModel>() {
            @Override
            public void onResponse(Call<OffersModel> call, Response<OffersModel> response) {
                if (response.isSuccessful()) {
                    OffersModel model = response.body();
                    Log.d(TAG, "response17:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<OffersModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }


    public void offerEnrolmentCall()
    {
        networkCall.offerEnrolment("John Doe", "5", "01814010101", "contact@johndoe.com").enqueue(new Callback<OffersEnrollModel>() {
            @Override
            public void onResponse(Call<OffersEnrollModel> call, Response<OffersEnrollModel> response) {
                if (response.isSuccessful()) {
                    OffersEnrollModel model = response.body();
                    Log.d(TAG, "response18:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<OffersEnrollModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }

    public void batchesCall()
    {
        networkCall.batches().enqueue(new Callback<BatchModel>() {
            @Override
            public void onResponse(Call<BatchModel> call, Response<BatchModel> response) {
                if (response.isSuccessful()) {
                    BatchModel model = response.body();
                    Log.d(TAG, "response19:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<BatchModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }



    public void batchEnrollCall()
    {
        networkCall.batchEnrolment("John Doe", "102 ", "01814010101", "contact@johndoe.com").enqueue(new Callback<BatchEnrollModel>() {
            @Override
            public void onResponse(Call<BatchEnrollModel> call, Response<BatchEnrollModel> response) {
                if (response.isSuccessful()) {
                    BatchEnrollModel model = response.body();
                    Log.d(TAG, "response20:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<BatchEnrollModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }


    public void mentorsCall()
    {
        networkCall.mentors().enqueue(new Callback<MentorModel>() {
            @Override
            public void onResponse(Call<MentorModel> call, Response<MentorModel> response) {
                if (response.isSuccessful()) {
                    MentorModel model = response.body();
                    Log.d(TAG, "response21:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<MentorModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }


    public void branchesCall()
    {
        networkCall.branches().enqueue(new Callback<BranchModel>() {
            @Override
            public void onResponse(Call<BranchModel> call, Response<BranchModel> response) {
                if (response.isSuccessful()) {
                    BranchModel model = response.body();
                    Log.d(TAG, "response22:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<BranchModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }

    public void contactCall()
    {
        networkCall.contactus("John Doe", "+8801814214731","Lorem ipsum dolor sit amet").enqueue(new Callback<ContactModel>() {
            @Override
            public void onResponse(Call<ContactModel> call, Response<ContactModel> response) {
                if (response.isSuccessful()) {
                    ContactModel model = response.body();
                    Log.d(TAG, "response23:" + model.toString());
                    textView.setText("" + model.toString());
                } else {
                    Log.d(TAG, "error:" + response.code());
                }
            }

            @Override
            public void onFailure(Call<ContactModel> call, Throwable t) {
                Log.d(TAG, "failed!:" + t.getMessage());
            }
        });
    }
}