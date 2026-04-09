.class public abstract Lo7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo7/f$a;,
        Lo7/f$b;
    }
.end annotation


# static fields
.field public static final a:Lo7/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo7/f$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo7/f;->a:Lo7/f$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lgg/i;
.end method
