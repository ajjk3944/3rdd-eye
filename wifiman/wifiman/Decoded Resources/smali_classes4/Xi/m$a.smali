.class public final LXi/m$a;
.super LXi/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXi/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LXi/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LXi/m$a;

    invoke-direct {v0}, LXi/m$a;-><init>()V

    sput-object v0, LXi/m$a;->a:LXi/m$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LXi/m;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
