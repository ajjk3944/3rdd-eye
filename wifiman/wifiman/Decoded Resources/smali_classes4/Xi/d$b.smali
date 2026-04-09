.class public final LXi/d$b;
.super LXi/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXi/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LXi/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LXi/d$b;

    invoke-direct {v0}, LXi/d$b;-><init>()V

    sput-object v0, LXi/d$b;->a:LXi/d$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LXi/d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
