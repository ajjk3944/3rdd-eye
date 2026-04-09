.class public final LXi/e$g;
.super LXi/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXi/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# static fields
.field public static final a:LXi/e$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LXi/e$g;

    invoke-direct {v0}, LXi/e$g;-><init>()V

    sput-object v0, LXi/e$g;->a:LXi/e$g;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LXi/e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
