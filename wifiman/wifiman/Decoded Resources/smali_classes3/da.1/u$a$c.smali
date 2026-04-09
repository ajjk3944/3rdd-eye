.class public final Lda/u$a$c;
.super Lda/u$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lda/u$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lda/u$a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lda/u$a$c;

    invoke-direct {v0}, Lda/u$a$c;-><init>()V

    sput-object v0, Lda/u$a$c;->a:Lda/u$a$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lda/u$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
