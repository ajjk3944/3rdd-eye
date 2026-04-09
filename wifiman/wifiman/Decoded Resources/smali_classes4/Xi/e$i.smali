.class public final LXi/e$i;
.super LXi/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXi/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# static fields
.field public static final a:LXi/e$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LXi/e$i;

    invoke-direct {v0}, LXi/e$i;-><init>()V

    sput-object v0, LXi/e$i;->a:LXi/e$i;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LXi/e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
