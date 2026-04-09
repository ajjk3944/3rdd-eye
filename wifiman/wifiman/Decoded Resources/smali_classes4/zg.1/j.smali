.class public final enum Lzg/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzg/j$a;,
        Lzg/j$c;,
        Lzg/j$b;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lzg/j;

.field public static final enum COMPLETE:Lzg/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzg/j;

    const-string v1, "COMPLETE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzg/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzg/j;->COMPLETE:Lzg/j;

    filled-new-array {v0}, [Lzg/j;

    move-result-object v0

    sput-object v0, Lzg/j;->$VALUES:[Lzg/j;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static accept(Ljava/lang/Object;LDj/b;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "LDj/b;",
            ")Z"
        }
    .end annotation

    .line 1
    sget-object v0, Lzg/j;->COMPLETE:Lzg/j;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    .line 2
    invoke-interface {p1}, LDj/b;->a()V

    return v1

    .line 3
    :cond_0
    instance-of v0, p0, Lzg/j$b;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Lzg/j$b;

    iget-object p0, p0, Lzg/j$b;->a:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return v1

    .line 5
    :cond_1
    invoke-interface {p1, p0}, LDj/b;->h(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static accept(Ljava/lang/Object;Lgg/x;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lgg/x;",
            ")Z"
        }
    .end annotation

    .line 6
    sget-object v0, Lzg/j;->COMPLETE:Lzg/j;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    .line 7
    invoke-interface {p1}, Lgg/x;->a()V

    return v1

    .line 8
    :cond_0
    instance-of v0, p0, Lzg/j$b;

    if-eqz v0, :cond_1

    .line 9
    check-cast p0, Lzg/j$b;

    iget-object p0, p0, Lzg/j$b;->a:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return v1

    .line 10
    :cond_1
    invoke-interface {p1, p0}, Lgg/x;->h(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return p0
.end method

.method public static acceptFull(Ljava/lang/Object;LDj/b;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "LDj/b;",
            ")Z"
        }
    .end annotation

    .line 1
    sget-object v0, Lzg/j;->COMPLETE:Lzg/j;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    .line 2
    invoke-interface {p1}, LDj/b;->a()V

    return v1

    .line 3
    :cond_0
    instance-of v0, p0, Lzg/j$b;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Lzg/j$b;

    iget-object p0, p0, Lzg/j$b;->a:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    return v1

    .line 5
    :cond_1
    instance-of v0, p0, Lzg/j$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 6
    check-cast p0, Lzg/j$c;

    iget-object p0, p0, Lzg/j$c;->a:LDj/c;

    invoke-interface {p1, p0}, LDj/b;->j(LDj/c;)V

    return v1

    .line 7
    :cond_2
    invoke-interface {p1, p0}, LDj/b;->h(Ljava/lang/Object;)V

    return v1
.end method

.method public static acceptFull(Ljava/lang/Object;Lgg/x;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lgg/x;",
            ")Z"
        }
    .end annotation

    .line 8
    sget-object v0, Lzg/j;->COMPLETE:Lzg/j;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    .line 9
    invoke-interface {p1}, Lgg/x;->a()V

    return v1

    .line 10
    :cond_0
    instance-of v0, p0, Lzg/j$b;

    if-eqz v0, :cond_1

    .line 11
    check-cast p0, Lzg/j$b;

    iget-object p0, p0, Lzg/j$b;->a:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    return v1

    .line 12
    :cond_1
    instance-of v0, p0, Lzg/j$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 13
    check-cast p0, Lzg/j$a;

    iget-object p0, p0, Lzg/j$a;->a:Lhg/c;

    invoke-interface {p1, p0}, Lgg/x;->c(Lhg/c;)V

    return v1

    .line 14
    :cond_2
    invoke-interface {p1, p0}, Lgg/x;->h(Ljava/lang/Object;)V

    return v1
.end method

.method public static complete()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lzg/j;->COMPLETE:Lzg/j;

    return-object v0
.end method

.method public static disposable(Lhg/c;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lzg/j$a;

    invoke-direct {v0, p0}, Lzg/j$a;-><init>(Lhg/c;)V

    return-object v0
.end method

.method public static error(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lzg/j$b;

    invoke-direct {v0, p0}, Lzg/j$b;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static getDisposable(Ljava/lang/Object;)Lhg/c;
    .locals 0

    check-cast p0, Lzg/j$a;

    iget-object p0, p0, Lzg/j$a;->a:Lhg/c;

    return-object p0
.end method

.method public static getError(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    check-cast p0, Lzg/j$b;

    iget-object p0, p0, Lzg/j$b;->a:Ljava/lang/Throwable;

    return-object p0
.end method

.method public static getSubscription(Ljava/lang/Object;)LDj/c;
    .locals 0

    check-cast p0, Lzg/j$c;

    iget-object p0, p0, Lzg/j$c;->a:LDj/c;

    return-object p0
.end method

.method public static getValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    return-object p0
.end method

.method public static isComplete(Ljava/lang/Object;)Z
    .locals 1

    sget-object v0, Lzg/j;->COMPLETE:Lzg/j;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isDisposable(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, Lzg/j$a;

    return p0
.end method

.method public static isError(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, Lzg/j$b;

    return p0
.end method

.method public static isSubscription(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, Lzg/j$c;

    return p0
.end method

.method public static next(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    return-object p0
.end method

.method public static subscription(LDj/c;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lzg/j$c;

    invoke-direct {v0, p0}, Lzg/j$c;-><init>(LDj/c;)V

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lzg/j;
    .locals 1

    const-class v0, Lzg/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzg/j;

    return-object p0
.end method

.method public static values()[Lzg/j;
    .locals 1

    sget-object v0, Lzg/j;->$VALUES:[Lzg/j;

    invoke-virtual {v0}, [Lzg/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzg/j;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NotificationLite.Complete"

    return-object v0
.end method
