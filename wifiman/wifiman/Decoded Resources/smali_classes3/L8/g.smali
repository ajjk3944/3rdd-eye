.class public final LL8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL8/g;

    invoke-direct {v0}, LL8/g;-><init>()V

    sput-object v0, LL8/g;->a:LL8/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(J)Ls9/d;
    .locals 3

    new-instance v0, Ls9/d$c;

    new-instance v1, LAj/e;

    invoke-direct {v1}, LAj/e;-><init>()V

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, LAj/e;->f(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method
