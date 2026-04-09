.class public final Lo0/j;
.super Lo0/g;
.source "SourceFile"


# static fields
.field public static final a:Lo0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/j;

    invoke-direct {v0}, Lo0/j;-><init>()V

    sput-object v0, Lo0/j;->a:Lo0/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo0/g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
