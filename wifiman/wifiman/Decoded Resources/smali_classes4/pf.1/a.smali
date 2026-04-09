.class public final Lpf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lpf/a;

.field public static b:Lmh/s;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpf/a;

    invoke-direct {v0}, Lpf/a;-><init>()V

    sput-object v0, Lpf/a;->a:Lpf/a;

    const/4 v0, 0x0

    sget-object v1, Lpf/a$a;->a:Lpf/a$a;

    const v2, -0x261bb614

    invoke-static {v2, v0, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lpf/a;->b:Lmh/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/s;
    .locals 1

    sget-object v0, Lpf/a;->b:Lmh/s;

    return-object v0
.end method
