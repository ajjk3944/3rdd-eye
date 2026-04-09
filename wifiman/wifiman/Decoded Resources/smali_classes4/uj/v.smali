.class public final Luj/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj/o;


# static fields
.field public static final a:Luj/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luj/v;

    invoke-direct {v0}, Luj/v;-><init>()V

    sput-object v0, Luj/v;->a:Luj/v;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lmh/a;)Luj/p;
    .locals 2

    const-string v0, "creator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Luj/p;

    new-instance v1, Luj/v$a;

    invoke-direct {v1, p1}, Luj/v$a;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, p1, v1}, Luj/p;-><init>(Ljava/lang/Object;Lmh/a;)V

    return-object v0
.end method
