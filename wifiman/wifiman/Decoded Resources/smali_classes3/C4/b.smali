.class public final LC4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LC4/a;


# direct methods
.method private constructor <init>(LC4/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC4/b;->a:LC4/a;

    return-void
.end method

.method public static a([BLo4/y;)LC4/b;
    .locals 0

    if-eqz p1, :cond_0

    new-instance p1, LC4/b;

    invoke-static {p0}, LC4/a;->a([B)LC4/a;

    move-result-object p0

    invoke-direct {p1, p0}, LC4/b;-><init>(LC4/a;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string/jumbo p1, "SecretKeyAccess required"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget-object v0, p0, LC4/b;->a:LC4/a;

    invoke-virtual {v0}, LC4/a;->c()I

    move-result v0

    return v0
.end method
