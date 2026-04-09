.class final LO1/n;
.super LO1/m;
.source "SourceFile"


# static fields
.field public static final a:LO1/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO1/n;

    invoke-direct {v0}, LO1/n;-><init>()V

    sput-object v0, LO1/n;->a:LO1/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LO1/m;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
