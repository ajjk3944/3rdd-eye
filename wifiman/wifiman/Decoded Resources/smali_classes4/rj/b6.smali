.class public final Lrj/b6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj/o;


# static fields
.field public static final a:Lrj/b6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrj/b6;

    invoke-direct {v0}, Lrj/b6;-><init>()V

    sput-object v0, Lrj/b6;->a:Lrj/b6;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lmh/a;)Luj/p;
    .locals 3

    const-string v0, "creator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    new-instance v1, Luj/p;

    new-instance v2, Lrj/b6$a;

    invoke-direct {v2, v0}, Lrj/b6$a;-><init>(Ljava/lang/ref/SoftReference;)V

    invoke-direct {v1, p1, v2}, Luj/p;-><init>(Ljava/lang/Object;Lmh/a;)V

    return-object v1
.end method
