.class final Li8/q$N0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/q;->m(Li8/a$b;)Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Li8/q$N0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li8/q$N0;

    invoke-direct {v0}, Li8/q$N0;-><init>()V

    sput-object v0, Li8/q$N0;->a:Li8/q$N0;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Le7/b;->Companion:Le7/b$a;

    invoke-virtual {v0, p1}, Le7/b$a;->f(Landroid/app/Activity;)Le7/b;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Li8/q$N0;->a(Landroid/app/Activity;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
