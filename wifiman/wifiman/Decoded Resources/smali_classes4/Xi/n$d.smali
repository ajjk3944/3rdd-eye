.class public final LXi/n$d;
.super LXi/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXi/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:LXi/n$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LXi/n$d;

    invoke-direct {v0}, LXi/n$d;-><init>()V

    sput-object v0, LXi/n$d;->a:LXi/n$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LXi/n;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
