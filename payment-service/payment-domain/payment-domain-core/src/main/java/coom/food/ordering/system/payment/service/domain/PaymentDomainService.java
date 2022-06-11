package coom.food.ordering.system.payment.service.domain;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import coom.food.ordering.system.payment.service.domain.entity.CreditEntry;
import coom.food.ordering.system.payment.service.domain.entity.CreditHistory;
import coom.food.ordering.system.payment.service.domain.entity.Payment;
import coom.food.ordering.system.payment.service.domain.event.PaymentCancelledEvent;
import coom.food.ordering.system.payment.service.domain.event.PaymentCompletedEvent;
import coom.food.ordering.system.payment.service.domain.event.PaymentEvent;
import coom.food.ordering.system.payment.service.domain.event.PaymentFailedEvent;

import java.util.List;

public interface PaymentDomainService {

    PaymentEvent validateAndInitiatePayment(Payment payment,
                                            CreditEntry creditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessages, DomainEventPublisher<PaymentCompletedEvent> paymentCompletedEventDomainEventPublisher, DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);

    PaymentEvent validateAndCancelPayment(Payment payment,
                                          CreditEntry creditEntry,
                                          List<CreditHistory> creditHistories,
                                          List<String> failureMessages, DomainEventPublisher<PaymentCancelledEvent> paymentCancelledEventDomainEventPublisher, DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);
}
