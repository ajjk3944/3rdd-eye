.class public final LNj/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LMj/w;

.field private final b:Ljava/lang/Throwable;


# direct methods
.method private constructor <init>(LMj/w;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNj/d;->a:LMj/w;

    iput-object p2, p0, LNj/d;->b:Ljava/lang/Throwable;

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)LNj/d;
    .locals 2

    if-eqz p0, :cond_0

    new-instance v0, LNj/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LNj/d;-><init>(LMj/w;Ljava/lang/Throwable;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "error == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(LMj/w;)LNj/d;
    .locals 2

    if-eqz p0, :cond_0

    new-instance v0, LNj/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LNj/d;-><init>(LMj/w;Ljava/lang/Throwable;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "response == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
