.class public final LS8/j$b$f$b;
.super LS8/j$b$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/j$b$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LS8/j$b$f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS8/j$b$f$b;

    invoke-direct {v0}, LS8/j$b$f$b;-><init>()V

    sput-object v0, LS8/j$b$f$b;->a:LS8/j$b$f$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LS8/j$b$f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
