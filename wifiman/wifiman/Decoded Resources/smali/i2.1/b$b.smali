.class final Li2/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field public static final a:Li2/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/b$b;

    invoke-direct {v0}, Li2/b$b;-><init>()V

    sput-object v0, Li2/b$b;->a:Li2/b$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const v0, 0xf4240

    invoke-static {v0}, Li2/a;->a(I)I

    move-result v0

    return v0
.end method
