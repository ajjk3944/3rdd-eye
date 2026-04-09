.class final LP8/g$n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/g$n;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP8/g$n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP8/g$n$a;

    invoke-direct {v0}, LP8/g$n$a;-><init>()V

    sput-object v0, LP8/g$n$a;->a:LP8/g$n$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIf/a;)LP8/f$b$b;
    .locals 1

    const-string/jumbo v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LP8/f$b$b;

    invoke-direct {v0, p1}, LP8/f$b$b;-><init>(LIf/a;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIf/a;

    invoke-virtual {p0, p1}, LP8/g$n$a;->a(LIf/a;)LP8/f$b$b;

    move-result-object p1

    return-object p1
.end method
