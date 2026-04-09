.class public final LS8/j$b$h$b;
.super LS8/j$b$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/j$b$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LS8/j$b$h$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS8/j$b$h$b;

    invoke-direct {v0}, LS8/j$b$h$b;-><init>()V

    sput-object v0, LS8/j$b$h$b;->a:LS8/j$b$h$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LS8/j$b$h;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
