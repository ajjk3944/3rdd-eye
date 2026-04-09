.class final Lio/reactivex/rxjava3/exceptions/CompositeException$d;
.super Lio/reactivex/rxjava3/exceptions/CompositeException$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/reactivex/rxjava3/exceptions/CompositeException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/io/PrintWriter;


# direct methods
.method constructor <init>(Ljava/io/PrintWriter;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/rxjava3/exceptions/CompositeException$b;-><init>()V

    iput-object p1, p0, Lio/reactivex/rxjava3/exceptions/CompositeException$d;->a:Ljava/io/PrintWriter;

    return-void
.end method


# virtual methods
.method bridge synthetic a(Ljava/lang/Object;)Lio/reactivex/rxjava3/exceptions/CompositeException$b;
    .locals 0

    invoke-virtual {p0, p1}, Lio/reactivex/rxjava3/exceptions/CompositeException$d;->b(Ljava/lang/Object;)Lio/reactivex/rxjava3/exceptions/CompositeException$d;

    move-result-object p1

    return-object p1
.end method

.method b(Ljava/lang/Object;)Lio/reactivex/rxjava3/exceptions/CompositeException$d;
    .locals 1

    iget-object v0, p0, Lio/reactivex/rxjava3/exceptions/CompositeException$d;->a:Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    return-object p0
.end method
