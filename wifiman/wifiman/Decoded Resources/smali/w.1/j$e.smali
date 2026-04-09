.class final Lw/j$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/j;->g(Ly0/G;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lw/j$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/j$e;

    invoke-direct {v0}, Lw/j$e;-><init>()V

    sput-object v0, Lw/j$e;->a:Lw/j$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lw/j$e;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
