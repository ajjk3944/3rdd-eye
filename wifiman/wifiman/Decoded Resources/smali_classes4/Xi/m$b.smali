.class public final LXi/m$b;
.super LXi/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXi/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LXi/m$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LXi/m$b;

    invoke-direct {v0}, LXi/m$b;-><init>()V

    sput-object v0, LXi/m$b;->a:LXi/m$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LXi/m;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
