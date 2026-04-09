.class final LN/G$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/G;->j(LN/I;Lmh/l;LT/l;II)LN/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/G$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/G$g;

    invoke-direct {v0}, LN/G$g;-><init>()V

    sput-object v0, LN/G$g;->a:LN/G$g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LN/I;)Ljava/lang/Boolean;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/I;

    invoke-virtual {p0, p1}, LN/G$g;->a(LN/I;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
