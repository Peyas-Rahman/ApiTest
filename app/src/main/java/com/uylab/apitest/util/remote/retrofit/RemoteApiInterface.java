package com.uylab.apitest.util.remote.retrofit;

import com.uylab.apitest.util.remote.model.PaymentNotification.Installment;
import com.uylab.apitest.util.remote.model.batch_enrollment.BatchEnrollModel;
import com.uylab.apitest.util.remote.model.batches.BatchModel;
import com.uylab.apitest.util.remote.model.branches.BranchModel;
import com.uylab.apitest.util.remote.model.classRoutine.ClassRoutine;
import com.uylab.apitest.util.remote.model.contact_us.ContactModel;
import com.uylab.apitest.util.remote.model.courseList.CourseModel;
import com.uylab.apitest.util.remote.model.course_enrollment.CourseEnrollModel;
import com.uylab.apitest.util.remote.model.event.EventModel;
import com.uylab.apitest.util.remote.model.eventEnrollment.EventEnrollModel;
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

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RemoteApiInterface {
    /**
     * Request to server for registration
     * */

    @FormUrlEncoded
    @POST("login")
    Call<LoginModel> login(@Field("email") String email, @Field("password") String password);


    @FormUrlEncoded
    @POST("join-request")
    Call<Example> joinRequest(@Field("name") String name, @Field("mobile_number") String mobileNumber, @Field("interested_subject") String subject);


    @GET("profile")
    Call<ProfileModel> profile();

    @GET("paymentInformation")
    Call<Installment> paymentInformation();


    @GET("notifications")
    Call<Example> notifications();

    @GET("classRoutine")
    Call<ClassRoutine> classRoutine();

    @GET("notice")
    Call<NoticeModel> notice();

    @GET("gallery")
    Call<GalleryModel> gallery();

    @GET("tutorials")
    Call<TutorialModel> tutorials();

    @GET("facilities")
    Call<FaculitylModel> facilities();

    @GET("seminars")
    Call<SeminarModel> seminars();

    @FormUrlEncoded
    @POST("seminar")
    Call<SeminarEnrolModel> seminar(@Field("participator_name") String participator_name, @Field("seminar_id") String seminerId  , @Field("mobile_number") String mobile_number, @Field("email_address") String email_address );


    @GET("events")
    Call<EventModel> events();

    @FormUrlEncoded
    @POST("eventEnrolment")
    Call<EventEnrollModel> eventEnrolment(@Field("participator_name") String participator_name, @Field("seminar_id") String seminerId  , @Field("mobile_number") String mobile_number, @Field("email_address") String email_address );


    @GET("courses")
    Call<CourseModel> courses();

    @FormUrlEncoded
    @POST("course")
    Call<CourseEnrollModel> course(@Field("participator_name") String participator_name, @Field("course_id") String courseId  , @Field("mobile_number") String mobile_number, @Field("email_address") String email_address );


    @GET("partners")
    Call<PartenersModel> partners();


    @GET("offers")
    Call<OffersModel> offers();

    @FormUrlEncoded
    @POST("offerEnrolment")
    Call<OffersEnrollModel> offerEnrolment(@Field("participator_name") String participator_name, @Field("seminar_id") String seminerId  , @Field("mobile_number") String mobile_number, @Field("email_address") String email_address );


    @GET("batches")
    Call<BatchModel> batches();

    @FormUrlEncoded
    @POST("batchEnrolment")
    Call<BatchEnrollModel> batchEnrolment(@Field("participator_name") String participator_name, @Field("offer_id") String offerId  , @Field("mobile_number") String mobile_number, @Field("email_address") String email_address );


    @GET("mentors")
    Call<MentorModel> mentors();

    @GET("branches")
    Call<BranchModel> branches();


    @FormUrlEncoded
    @POST("contactus")
    Call<ContactModel> contactus(@Field("name") String name, @Field("mobile_number") String mobileNumber  , @Field("message") String message);

}
