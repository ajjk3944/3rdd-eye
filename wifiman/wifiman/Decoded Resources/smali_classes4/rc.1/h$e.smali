.class final Lrc/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrc/h;-><init>(Lj4/b;Lhc/b;LMb/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrc/h;


# direct methods
.method constructor <init>(Lrc/h;)V
    .locals 0

    iput-object p1, p0, Lrc/h$e;->a:Lrc/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LMb/c;)LMb/c;
    .locals 0

    invoke-static {p0}, Lrc/h$e;->c(LMb/c;)LMb/c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LMb/c;)LMb/c;
    .locals 11

    const-string v0, "currentState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, LMb/c;->f()Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v2}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v6

    new-instance v7, Ljava/util/Date;

    invoke-direct {v7, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6, v7}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    invoke-static {v2}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v2

    const/4 v4, 0x7

    invoke-virtual {v6, v4}, Ljava/util/Calendar;->get(I)I

    move-result v5

    invoke-virtual {v2, v4}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v4, 0x2

    const/4 v6, 0x0

    if-eq v5, v2, :cond_0

    invoke-virtual {p0}, LMb/c;->c()I

    move-result v2

    add-int/2addr v2, v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Updating app lauch day count to "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v6, v4, v6}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {p0}, LMb/c;->c()I

    move-result v2

    add-int/2addr v2, v3

    :goto_0
    move v3, v2

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LMb/c;->c()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "lauch day stays at "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v6, v4, v6}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {p0}, LMb/c;->c()I

    move-result v2

    goto :goto_0

    :cond_1
    :goto_1
    move v6, v3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/16 v9, 0x9

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v10}, LMb/c;->b(LMb/c;IILjava/lang/Long;ZILjava/lang/Object;)LMb/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LMb/c;

    invoke-virtual {p0, p1}, Lrc/h$e;->b(LMb/c;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(LMb/c;)Lgg/f;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lrc/h$e;->a:Lrc/h;

    invoke-static {p1}, Lrc/h;->j(Lrc/h;)Lrc/h$a;

    move-result-object p1

    new-instance v0, Lrc/i;

    invoke-direct {v0}, Lrc/i;-><init>()V

    invoke-virtual {p1, v0}, Lcom/ui/wifiman/db/RoomPersistentInstance;->a(Lmh/l;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
