.class final LF/a0$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/a0$b;->a(LM/F;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LF/a0$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF/a0$b$a;

    invoke-direct {v0}, LF/a0$b$a;-><init>()V

    sput-object v0, LF/a0$b$a;->a:LF/a0$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LM/F;)V
    .locals 0

    invoke-virtual {p1}, LM/b;->A()LM/b;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LM/F;

    invoke-virtual {p0, p1}, LF/a0$b$a;->a(LM/F;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
