.class public final Lda/t$b;
.super Lda/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lda/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lda/t$b;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lda/t$b;

    invoke-direct {v0}, Lda/t$b;-><init>()V

    sput-object v0, Lda/t$b;->a:Lda/t$b;

    const-string/jumbo v0, "verification"

    sput-object v0, Lda/t$b;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lda/t;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lda/t$b;->b:Ljava/lang/String;

    return-object v0
.end method
