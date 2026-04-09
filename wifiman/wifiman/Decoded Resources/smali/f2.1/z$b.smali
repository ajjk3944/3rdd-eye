.class final Lf2/z$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/z;->f(Lf2/z;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lf2/z$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf2/z$b;

    invoke-direct {v0}, Lf2/z$b;-><init>()V

    sput-object v0, Lf2/z$b;->a:Lf2/z$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf2/G;)V
    .locals 1

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/G;

    invoke-virtual {p0, p1}, Lf2/z$b;->a(Lf2/G;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
