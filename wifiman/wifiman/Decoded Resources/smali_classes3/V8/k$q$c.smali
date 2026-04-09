.class final LV8/k$q$c;
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
.field public static final a:LV8/k$q$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV8/k$q$c;

    invoke-direct {v0}, LV8/k$q$c;-><init>()V

    sput-object v0, LV8/k$q$c;->a:LV8/k$q$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LV8/k$q$c$a;->a:LV8/k$q$c$a;

    invoke-static {v0, p1}, LX8/a;->d(Lmh/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LV8/k$q$c;->a(Ljava/lang/Throwable;)V

    return-void
.end method
