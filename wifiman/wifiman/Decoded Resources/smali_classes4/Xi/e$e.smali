.class public final LXi/e$e;
.super LXi/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXi/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final a:LXi/e$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LXi/e$e;

    invoke-direct {v0}, LXi/e$e;-><init>()V

    sput-object v0, LXi/e$e;->a:LXi/e$e;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LXi/e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
