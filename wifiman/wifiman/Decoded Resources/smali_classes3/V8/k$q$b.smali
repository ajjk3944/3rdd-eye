.class final LV8/k$q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k$q;-><init>(LG6/N;LV8/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LV8/k$q$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV8/k$q$b;

    invoke-direct {v0}, LV8/k$q$b;-><init>()V

    sput-object v0, LV8/k$q$b;->a:LV8/k$q$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LV8/k$q$b$a;->a:LV8/k$q$b$a;

    invoke-static {p1}, LX8/a;->c(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, LV8/k$q$b;->a(Lhg/c;)V

    return-void
.end method
