.class public final LA9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA9/a;

.field public static b:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LA9/a;

    invoke-direct {v0}, LA9/a;-><init>()V

    sput-object v0, LA9/a;->a:LA9/a;

    const/4 v0, 0x0

    sget-object v1, LA9/a$a;->a:LA9/a$a;

    const v2, -0x52a39dcf

    invoke-static {v2, v0, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LA9/a;->b:Lmh/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/p;
    .locals 1

    sget-object v0, LA9/a;->b:Lmh/p;

    return-object v0
.end method
