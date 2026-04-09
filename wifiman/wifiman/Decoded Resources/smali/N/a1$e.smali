.class final LN/a1$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a1;->d(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZILmh/l;LL0/U;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/a1$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/a1$e;

    invoke-direct {v0}, LN/a1$e;-><init>()V

    sput-object v0, LN/a1$e;->a:LN/a1$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/M;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/M;

    invoke-virtual {p0, p1}, LN/a1$e;->a(LL0/M;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
