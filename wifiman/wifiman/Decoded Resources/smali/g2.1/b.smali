.class public final Lg2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg2/b;

.field public static b:Lmh/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg2/b;

    invoke-direct {v0}, Lg2/b;-><init>()V

    sput-object v0, Lg2/b;->a:Lg2/b;

    const/4 v0, 0x0

    sget-object v1, Lg2/b$a;->a:Lg2/b$a;

    const v2, 0x798b76f

    invoke-static {v2, v0, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, Lg2/b;->b:Lmh/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/r;
    .locals 1

    sget-object v0, Lg2/b;->b:Lmh/r;

    return-object v0
.end method
