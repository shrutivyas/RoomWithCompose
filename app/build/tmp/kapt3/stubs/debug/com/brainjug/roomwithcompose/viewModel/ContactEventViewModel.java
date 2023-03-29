package com.brainjug.roomwithcompose.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/brainjug/roomwithcompose/viewModel/ContactEventViewModel;", "Landroidx/lifecycle/ViewModel;", "dao", "Lcom/brainjug/roomwithcompose/dao/ContactDao;", "(Lcom/brainjug/roomwithcompose/dao/ContactDao;)V", "_contacts", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/brainjug/roomwithcompose/data/Contact;", "_sortType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/brainjug/roomwithcompose/utils/SortType;", "_state", "Lcom/brainjug/roomwithcompose/data/ContactState;", "state", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEvent", "", "event", "Lcom/brainjug/roomwithcompose/interfaces/ContactEvent;", "app_debug"})
public final class ContactEventViewModel extends androidx.lifecycle.ViewModel {
    private final com.brainjug.roomwithcompose.dao.ContactDao dao = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.brainjug.roomwithcompose.utils.SortType> _sortType = null;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.brainjug.roomwithcompose.data.Contact>> _contacts = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.brainjug.roomwithcompose.data.ContactState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.brainjug.roomwithcompose.data.ContactState> state = null;
    
    public ContactEventViewModel(@org.jetbrains.annotations.NotNull()
    com.brainjug.roomwithcompose.dao.ContactDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.brainjug.roomwithcompose.data.ContactState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.brainjug.roomwithcompose.interfaces.ContactEvent event) {
    }
}