.class final Lw/j$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/j;->e(Ly0/G;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lw/j$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/j$j;

    invoke-direct {v0}, Lw/j$j;-><init>()V

    sput-object v0, Lw/j$j;->a:Lw/j$j;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lw/j$j;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
