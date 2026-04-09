.class final LR0/V$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR0/V;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LR0/V$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LR0/V$g;

    invoke-direct {v0}, LR0/V$g;-><init>()V

    sput-object v0, LR0/V$g;->a:LR0/V$g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LR0/V$g;->a(Ljava/util/List;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
