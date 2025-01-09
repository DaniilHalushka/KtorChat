package com.halushka.chat.room

import java.lang.Exception

class MemberAlreadyExistsException: Exception(
    /* message = */ "There is already a member with that username in the room!"
)