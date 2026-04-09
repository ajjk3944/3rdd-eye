.class public abstract LF/W;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/W$a;
    }
.end annotation


# static fields
.field public static final a:LF/W$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF/W$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF/W$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LF/W;->a:LF/W$a;

    return-void
.end method
