.class public abstract LDh/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBh/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDh/z$a;
    }
.end annotation


# static fields
.field public static final a:LDh/z$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LDh/z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDh/z$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LDh/z;->a:LDh/z$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract I(Lpi/E0;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
.end method

.method protected abstract i0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lii/k;
.end method
