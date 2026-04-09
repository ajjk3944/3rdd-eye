.class public abstract LMd/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMd/g$a;,
        LMd/g$b;,
        LMd/g$c;
    }
.end annotation


# static fields
.field public static final a:LMd/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LMd/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LMd/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LMd/g;->a:LMd/g$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LMd/g;-><init>()V

    return-void
.end method
