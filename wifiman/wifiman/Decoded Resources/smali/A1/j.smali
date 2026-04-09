.class public final LA1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA1/j$b;,
        LA1/j$a;
    }
.end annotation


# static fields
.field private static final b:LA1/j;


# instance fields
.field private final a:LA1/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Locale;

    invoke-static {v0}, LA1/j;->a([Ljava/util/Locale;)LA1/j;

    move-result-object v0

    sput-object v0, LA1/j;->b:LA1/j;

    return-void
.end method

.method private constructor <init>(LA1/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA1/j;->a:LA1/k;

    return-void
.end method

.method public static varargs a([Ljava/util/Locale;)LA1/j;
    .locals 0

    invoke-static {p0}, LA1/j$b;->a([Ljava/util/Locale;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {p0}, LA1/j;->h(Landroid/os/LocaleList;)LA1/j;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)LA1/j;
    .locals 4

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, ","

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    new-array v1, v0, [Ljava/util/Locale;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    invoke-static {v3}, LA1/j$a;->a(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, LA1/j;->a([Ljava/util/Locale;)LA1/j;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    invoke-static {}, LA1/j;->d()LA1/j;

    move-result-object p0

    return-object p0
.end method

.method public static d()LA1/j;
    .locals 1

    sget-object v0, LA1/j;->b:LA1/j;

    return-object v0
.end method

.method public static h(Landroid/os/LocaleList;)LA1/j;
    .locals 2

    new-instance v0, LA1/j;

    new-instance v1, LA1/l;

    invoke-direct {v1, p0}, LA1/l;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, LA1/j;-><init>(LA1/k;)V

    return-object v0
.end method


# virtual methods
.method public c(I)Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, LA1/j;->a:LA1/k;

    invoke-interface {v0, p1}, LA1/k;->get(I)Ljava/util/Locale;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, LA1/j;->a:LA1/k;

    invoke-interface {v0}, LA1/k;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LA1/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, LA1/j;->a:LA1/k;

    check-cast p1, LA1/j;

    iget-object p1, p1, LA1/j;->a:LA1/k;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()I
    .locals 1

    iget-object v0, p0, LA1/j;->a:LA1/k;

    invoke-interface {v0}, LA1/k;->size()I

    move-result v0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LA1/j;->a:LA1/k;

    invoke-interface {v0}, LA1/k;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LA1/j;->a:LA1/k;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LA1/j;->a:LA1/k;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
