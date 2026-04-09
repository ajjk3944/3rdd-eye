.class public final LQ7/f;
.super LSj/a$c;
.source "SourceFile"


# instance fields
.field private final b:Lcom/google/firebase/crashlytics/a;

.field private final c:LS7/e;

.field private final d:Lve/g;


# direct methods
.method public constructor <init>(Lcom/google/firebase/crashlytics/a;LS7/e;Lve/g;)V
    .locals 1

    const-string/jumbo v0, "crashlytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sensitiveLogMasker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "fileLog"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LSj/a$c;-><init>()V

    iput-object p1, p0, LQ7/f;->b:Lcom/google/firebase/crashlytics/a;

    iput-object p2, p0, LQ7/f;->c:LS7/e;

    iput-object p3, p0, LQ7/f;->d:Lve/g;

    return-void
.end method

.method private final q(I)Ljava/lang/String;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const-string/jumbo p1, "NO_PRIORITY"

    goto :goto_0

    :pswitch_0
    const-string p1, "ASSERT"

    goto :goto_0

    :pswitch_1
    const-string/jumbo p1, "ERROR"

    goto :goto_0

    :pswitch_2
    const-string/jumbo p1, "WARN"

    goto :goto_0

    :pswitch_3
    const-string/jumbo p1, "I"

    goto :goto_0

    :pswitch_4
    const-string p1, "D"

    goto :goto_0

    :pswitch_5
    const-string/jumbo p1, "V"

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method protected l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 5

    const-string/jumbo v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ7/f;->b:Lcom/google/firebase/crashlytics/a;

    invoke-direct {p0, p1}, LQ7/f;->q(I)Ljava/lang/String;

    move-result-object v1

    if-eqz p2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    const-string v2, ""

    :cond_1
    iget-object v3, p0, LQ7/f;->c:LS7/e;

    invoke-interface {v3, p3}, LS7/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/crashlytics/a;->e(Ljava/lang/String;)V

    iget-object v0, p0, LQ7/f;->d:Lve/g;

    invoke-interface {v0, p1, p2, p3}, Lve/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x6

    if-eq p1, p2, :cond_2

    const/4 p2, 0x7

    if-eq p1, p2, :cond_2

    goto :goto_0

    :cond_2
    if-nez p4, :cond_3

    iget-object p1, p0, LQ7/f;->b:Lcom/google/firebase/crashlytics/a;

    new-instance p2, Ljava/lang/Exception;

    invoke-direct {p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/google/firebase/crashlytics/a;->f(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, LQ7/f;->b:Lcom/google/firebase/crashlytics/a;

    invoke-virtual {p1, p4}, Lcom/google/firebase/crashlytics/a;->f(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
