package com.chatbot.ui.auth.login

import com.chatbot.data.DataManager
import com.chatbot.data.io.SchedulerProvider
import com.chatbot.ui.base.BasePresenterImpl
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * @author lusinabrian
 * @notes: Presenter layer to interact with data and view
 */
class LoginPresenterImpl<V : LoginView>
@Inject
constructor(mDatamanager: DataManager, mCompositeDisposable: CompositeDisposable,
            mSchedulerProvider: SchedulerProvider) : BasePresenterImpl<V>(mDatamanager, mSchedulerProvider, mCompositeDisposable), LoginPresenter<V> {

    override fun onAttach(mBaseView: V) {
        super.onAttach(mBaseView)
        baseView.setListeners()
    }

}