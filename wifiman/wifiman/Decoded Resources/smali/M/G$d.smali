.class final LM/G$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/G;-><init>(LF/u0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM/G$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM/G$d;

    invoke-direct {v0}, LM/G$d;-><init>()V

    sput-object v0, LM/G$d;->a:LM/G$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LR0/Q;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/Q;

    invoke-virtual {p0, p1}, LM/G$d;->a(LR0/Q;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
