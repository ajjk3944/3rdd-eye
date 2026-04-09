.class final Li0/e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final a:Li0/e$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li0/e$a$a;

    invoke-direct {v0}, Li0/e$a$a;-><init>()V

    sput-object v0, Li0/e$a$a;->a:Li0/e$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
