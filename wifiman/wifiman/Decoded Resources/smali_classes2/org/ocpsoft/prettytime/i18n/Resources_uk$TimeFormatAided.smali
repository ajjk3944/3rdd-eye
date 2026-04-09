.class Lorg/ocpsoft/prettytime/i18n/Resources_uk$TimeFormatAided;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAj/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/ocpsoft/prettytime/i18n/Resources_uk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TimeFormatAided"
.end annotation


# instance fields
.field private final a:[Ljava/lang/String;


# direct methods
.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v0, p1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_uk$TimeFormatAided;->a:[Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong plural forms number for slavic language!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private c(ZZJLjava/lang/String;)Ljava/lang/String;
    .locals 11

    const-wide/16 v0, 0xa

    rem-long v2, p3, v0

    const-wide/16 v4, 0x1

    cmp-long v4, v2, v4

    const-wide/16 v5, 0x64

    if-nez v4, :cond_0

    rem-long v7, p3, v5

    const-wide/16 v9, 0xb

    cmp-long v4, v7, v9

    if-eqz v4, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v7, 0x2

    cmp-long v4, v2, v7

    if-ltz v4, :cond_2

    const-wide/16 v7, 0x4

    cmp-long v2, v2, v7

    if-gtz v2, :cond_2

    rem-long v2, p3, v5

    cmp-long v0, v2, v0

    if-ltz v0, :cond_1

    const-wide/16 v0, 0x14

    cmp-long v0, v2, v0

    if-ltz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    :goto_0
    const/4 v1, 0x3

    if-gt v0, v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p2, :cond_3

    const-string v2, "\u0447\u0435\u0440\u0435\u0437 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    move-object/from16 v2, p5

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object v2, p0

    iget-object v3, v2, Lorg/ocpsoft/prettytime/i18n/Resources_uk$TimeFormatAided;->a:[Ljava/lang/String;

    aget-object v0, v3, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_4

    const-string v0, " \u0442\u043e\u043c\u0443"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_5
    move-object v2, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Wrong plural index was calculated somehow for slavic language"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(LAj/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    invoke-interface {p1}, LAj/a;->e()Z

    move-result v1

    invoke-interface {p1}, LAj/a;->b()Z

    move-result v2

    const/16 v0, 0x32

    invoke-interface {p1, v0}, LAj/a;->d(I)J

    move-result-wide v3

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lorg/ocpsoft/prettytime/i18n/Resources_uk$TimeFormatAided;->c(ZZJLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(LAj/a;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x32

    invoke-interface {p1, v0}, LAj/a;->d(I)J

    move-result-wide v0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
