package com.smartec.account.common.events;

import com.smartec.account.common.dto.AccountType;
import com.smartec.cqrs.core.events.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
public class AccountClosedEvent extends BaseEvent {
}
