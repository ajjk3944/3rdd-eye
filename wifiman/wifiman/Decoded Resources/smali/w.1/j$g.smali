.class final Lw/j$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/j;->g(Ly0/G;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lw/j$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/j$g;

    invoke-direct {v0}, Lw/j$g;-><init>()V

    sput-object v0, Lw/j$g;->a:Lw/j$g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lw/j$g;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
