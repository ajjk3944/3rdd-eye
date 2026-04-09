.class public final LS8/j$b$g$b;
.super LS8/j$b$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/j$b$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LS8/j$b$g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS8/j$b$g$b;

    invoke-direct {v0}, LS8/j$b$g$b;-><init>()V

    sput-object v0, LS8/j$b$g$b;->a:LS8/j$b$g$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LS8/j$b$g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
