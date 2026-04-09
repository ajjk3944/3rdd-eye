.class public abstract La6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La6/b$a;,
        La6/b$b;
    }
.end annotation


# static fields
.field public static final c:La6/b$b;


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La6/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La6/b$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, La6/b;->c:La6/b$b;

    return-void
.end method

.method private constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, La6/b;->a:I

    .line 4
    iput p2, p0, La6/b;->b:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, La6/b;-><init>(II)V

    return-void
.end method
