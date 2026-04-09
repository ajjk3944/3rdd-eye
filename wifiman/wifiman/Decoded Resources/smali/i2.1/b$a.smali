.class final Li2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final a:Li2/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/b$a;

    invoke-direct {v0}, Li2/b$a;-><init>()V

    sput-object v0, Li2/b$a;->a:Li2/b$a;

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

    const/16 v0, 0x1f

    invoke-static {v0}, Li2/a;->a(I)I

    move-result v0

    return v0
.end method
