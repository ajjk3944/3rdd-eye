.class public final Lo7/a$b;
.super Lo7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lo7/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo7/a$b;

    invoke-direct {v0}, Lo7/a$b;-><init>()V

    sput-object v0, Lo7/a$b;->a:Lo7/a$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo7/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
