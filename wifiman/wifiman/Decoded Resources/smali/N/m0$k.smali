.class final LN/m0$k;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/m0;->j(LN/o0;Lr/i;Lmh/l;ZLT/l;II)LN/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/m0$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/m0$k;

    invoke-direct {v0}, LN/m0$k;-><init>()V

    sput-object v0, LN/m0$k;->a:LN/m0$k;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/o0;)Ljava/lang/Boolean;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/o0;

    invoke-virtual {p0, p1}, LN/m0$k;->a(LN/o0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
